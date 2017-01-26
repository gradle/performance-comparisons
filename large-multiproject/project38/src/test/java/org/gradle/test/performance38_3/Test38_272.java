package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_272 {
    private final Production38_272 production = new Production38_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}