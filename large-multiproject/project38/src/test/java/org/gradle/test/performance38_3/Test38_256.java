package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_256 {
    private final Production38_256 production = new Production38_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}