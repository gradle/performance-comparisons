package org.gradle.test.performancenull_184;

import static org.junit.Assert.*;

public class Testnull_18378 {
    private final Productionnull_18378 production = new Productionnull_18378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}