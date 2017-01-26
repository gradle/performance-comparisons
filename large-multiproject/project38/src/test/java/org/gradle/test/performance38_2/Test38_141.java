package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_141 {
    private final Production38_141 production = new Production38_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}