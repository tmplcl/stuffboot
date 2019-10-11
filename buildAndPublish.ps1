mvn clean package
docker build -t org.tmplcl/stuffboot .
docker rm -f stuffboot
docker tag org.tmplcl/stuffboot tmplcl/stuffboot
docker push tmplcl/stuffboot