package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49189 {
    private final Productionnull_49189 production = new Productionnull_49189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}