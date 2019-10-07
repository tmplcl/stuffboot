mvn clean package
docker build -t org.tmplcl/stuffboot .
docker rm -f stuffboot
docker run -p 8080:8080 --name stuffboot org.tmplcl/stuffboot