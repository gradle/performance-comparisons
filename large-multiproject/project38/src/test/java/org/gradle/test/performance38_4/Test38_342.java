package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_342 {
    private final Production38_342 production = new Production38_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}