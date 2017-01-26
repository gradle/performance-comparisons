package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_423 {
    private final Production38_423 production = new Production38_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}