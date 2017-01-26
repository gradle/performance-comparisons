package org.gradle.test.performancenull_156;

import static org.junit.Assert.*;

public class Testnull_15531 {
    private final Productionnull_15531 production = new Productionnull_15531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}