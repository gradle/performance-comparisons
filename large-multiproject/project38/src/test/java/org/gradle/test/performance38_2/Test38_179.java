package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_179 {
    private final Production38_179 production = new Production38_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}