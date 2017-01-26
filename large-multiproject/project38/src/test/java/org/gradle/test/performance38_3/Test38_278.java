package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_278 {
    private final Production38_278 production = new Production38_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}