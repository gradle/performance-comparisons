package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_299 {
    private final Production38_299 production = new Production38_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}