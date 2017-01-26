package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28126 {
    private final Productionnull_28126 production = new Productionnull_28126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}