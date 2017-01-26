package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34082 {
    private final Productionnull_34082 production = new Productionnull_34082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}