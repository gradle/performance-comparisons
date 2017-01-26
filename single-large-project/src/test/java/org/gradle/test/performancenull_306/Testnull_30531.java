package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30531 {
    private final Productionnull_30531 production = new Productionnull_30531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}