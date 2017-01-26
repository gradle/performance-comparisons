package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_250 {
    private final Production38_250 production = new Production38_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}