package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18038 {
    private final Productionnull_18038 production = new Productionnull_18038("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}