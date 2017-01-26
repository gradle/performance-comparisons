package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_429 {
    private final Production38_429 production = new Production38_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}