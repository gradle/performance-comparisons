package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_129 {
    private final Production38_129 production = new Production38_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}