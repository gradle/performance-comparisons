package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21684 {
    private final Productionnull_21684 production = new Productionnull_21684("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}