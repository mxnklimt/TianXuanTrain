# 购买服务器

准备好云服务器，注意服务器的版本需要是 Centos 7+（推荐） 或者 Ubuntu 18+

# 配置端口

在服务器的防火墙或者安全组里，将需要的端口打开

![](media/image1.png){width="5.415277777777778in"
height="1.832638888888889in"}

腾讯云为例：

![](media/image2.png){width="5.414583333333334in"
height="2.7979166666666666in"}

# 远程连接服务器

使用 MobaXterm 连接到自己的服务器。

下载链接：<https://mobaxterm.mobatek.net/download.html>

![](media/image3.png){width="5.534722222222222in"
height="3.0284722222222222in"}

![](media/image4.png){width="5.563194444444444in"
height="2.8618055555555557in"}

# 安装Git工具

安装好git工具，指令如下

Ubuntu系统：sudo apt install -y git

Centos系统：sudo yum install -y git

# 安装Java

1.  从[[Oracle官网]{.underline}](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
    选择Java 8版本下载，推荐下载jdk-8u201-linux-x64.tar.gz
    (需要注册登陆一下Oracle账号)

2.  将安装包上传到服务器 /software
    目录下（如果要放到别的目录，下面第四步中配置的信息相应修改一下即可）

3.  解压安装包 tar -zxvf jdk-8u201-linux-x64.tar.gz

4.  配置Java环境 vim /etc/profile

5.  将下面内容输入到文件内

export JAVA_HOME=/software/jdk1.8.0_201

export PATH=\$JAVA_HOME/bin:\$PATH

export CLASSPATH=.:\$JAVA_HOME/lib/dt.jar:\$JAVA_HOME/lib/tools.jar

6.  生效profile配置 source /etc/profile

7.  查看Java安装结果 java -version

8.  配置JDK熵池

9.  打开 \$JAVA_PATH/jre/lib/security/java.security 文件，将其中
    securerandom.source=file:/dev/random 替换为
    securerandom.source=file:/dev/urandom

# 安装Maven

1.  下载安装包

wget
http://mirrors.tuna.tsinghua.edu.cn/apache/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz

2.  解压安装包 tar -zxvf apache-maven-3.3.9-bin.tar.gz

3.  配置环境变量 vim /etc/profile

4.  在文件末尾增加

MAVEN_HOME=/software/apache-maven-3.3.9

export PATH=\${MAVEN_HOME}/bin:\${PATH}

5.  生效环境配置 source /etc/profile

6.  查询Maven安装结果 mvn -v

7.  （可选）配置国内镜像源，找到Maven的setting.xml文件，在maven对应文件夹内的conf文件夹下

在 \<mirrors\>里写入：

\<mirror\>

\<id\>nexus-aliyun\</id\>

\<mirrorOf\>central\</mirrorOf\>

\<name\>Nexus aliyun\</name\>

\<url\>http://maven.aliyun.com/nexus/content/groups/public\</url\>

\</mirror\>

# 安装Crudini

安装好crudini工具，指令如下

Ubuntu系统：sudo apt-get install -y crudini

Centos系统：sudo yum install -y crudini

检查安装结果：type crudini

返回类似信息即为安装成功：crudini is /usr/bin/crudini

Centos如果直接安装失败，则需要配置 epel 源

配置yum源为aliyun：

wget -O /etc/yum.repos.d/CentOS-Base.repo
http://mirrors.aliyun.com/repo/Centos-7.repo

wget -O /etc/yum.repos.d/epel.repo
http://mirrors.aliyun.com/repo/epel-7.repo

yum clean all

yum makecache

重新尝试安装：

sudo yum -y install crudini

# 拉取代码库

在 /root 目录下，创建文件夹 mkdir tianxuan ，进入文件夹内，拉取代码库

git clone
<https://github.com/TianXuan-Chain/thanos-package-generate.git>

天玄链部署的脚本
