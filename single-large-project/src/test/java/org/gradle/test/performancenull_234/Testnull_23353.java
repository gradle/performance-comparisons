package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23353 {
    private final Productionnull_23353 production = new Productionnull_23353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}