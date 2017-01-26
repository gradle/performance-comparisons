package org.gradle.test.performancenull_272;

import static org.junit.Assert.*;

public class Testnull_27186 {
    private final Productionnull_27186 production = new Productionnull_27186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}