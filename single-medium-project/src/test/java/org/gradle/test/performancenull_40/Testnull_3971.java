package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3971 {
    private final Productionnull_3971 production = new Productionnull_3971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}