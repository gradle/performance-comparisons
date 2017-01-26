package org.gradle.test.performancenull_44;

import static org.junit.Assert.*;

public class Testnull_4342 {
    private final Productionnull_4342 production = new Productionnull_4342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}