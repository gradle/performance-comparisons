package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_359 {
    private final Production38_359 production = new Production38_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}