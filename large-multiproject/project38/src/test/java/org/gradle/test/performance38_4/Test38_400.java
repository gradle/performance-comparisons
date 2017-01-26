package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_400 {
    private final Production38_400 production = new Production38_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}