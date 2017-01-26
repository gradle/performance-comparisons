package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_56 {
    private final Production38_56 production = new Production38_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}