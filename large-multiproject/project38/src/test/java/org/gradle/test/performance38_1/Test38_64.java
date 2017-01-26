package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_64 {
    private final Production38_64 production = new Production38_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}