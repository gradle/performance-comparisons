package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28466 {
    private final Productionnull_28466 production = new Productionnull_28466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}