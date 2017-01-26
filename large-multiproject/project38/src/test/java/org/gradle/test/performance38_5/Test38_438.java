package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_438 {
    private final Production38_438 production = new Production38_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}