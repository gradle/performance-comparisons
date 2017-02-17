#!/bin/bash

for d in abrams scott tarantino nolan
do
   rm -Rf gradlehome/caches/modules-2/metadata-2.23/descriptors/${d}*
   rm -Rf gradlehome/caches/modules-2/files-2.1/${d}*
done
rm -Rf gradlehome/caches/external-resources

