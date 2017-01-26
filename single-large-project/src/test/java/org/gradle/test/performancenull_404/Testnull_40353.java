package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40353 {
    private final Productionnull_40353 production = new Productionnull_40353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}