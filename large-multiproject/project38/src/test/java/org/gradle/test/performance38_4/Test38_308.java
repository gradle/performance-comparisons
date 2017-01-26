package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_308 {
    private final Production38_308 production = new Production38_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}