package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_485 {
    private final Production38_485 production = new Production38_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}