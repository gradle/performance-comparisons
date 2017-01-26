package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_339 {
    private final Production38_339 production = new Production38_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}