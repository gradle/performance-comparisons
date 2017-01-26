package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_24 {
    private final Production38_24 production = new Production38_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}