package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_349 {
    private final Production38_349 production = new Production38_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}