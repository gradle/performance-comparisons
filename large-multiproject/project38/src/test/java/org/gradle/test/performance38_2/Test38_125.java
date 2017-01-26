package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_125 {
    private final Production38_125 production = new Production38_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}