package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_177 {
    private final Production38_177 production = new Production38_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}