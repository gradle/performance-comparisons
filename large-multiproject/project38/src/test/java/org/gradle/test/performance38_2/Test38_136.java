package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_136 {
    private final Production38_136 production = new Production38_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}