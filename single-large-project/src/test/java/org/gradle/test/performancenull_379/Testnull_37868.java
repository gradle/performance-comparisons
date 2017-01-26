package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37868 {
    private final Productionnull_37868 production = new Productionnull_37868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}