package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_121 {
    private final Production38_121 production = new Production38_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}