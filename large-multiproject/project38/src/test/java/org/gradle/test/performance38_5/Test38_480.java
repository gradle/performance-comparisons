package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_480 {
    private final Production38_480 production = new Production38_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}