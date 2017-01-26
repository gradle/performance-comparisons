package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1739 {
    private final Productionnull_1739 production = new Productionnull_1739("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}