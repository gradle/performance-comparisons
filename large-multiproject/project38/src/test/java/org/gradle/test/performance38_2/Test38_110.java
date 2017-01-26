package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_110 {
    private final Production38_110 production = new Production38_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}