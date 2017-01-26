package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20698 {
    private final Productionnull_20698 production = new Productionnull_20698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}