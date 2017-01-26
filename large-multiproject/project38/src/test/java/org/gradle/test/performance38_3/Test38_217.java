package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_217 {
    private final Production38_217 production = new Production38_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}