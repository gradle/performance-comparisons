package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8101 {
    private final Productionnull_8101 production = new Productionnull_8101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}