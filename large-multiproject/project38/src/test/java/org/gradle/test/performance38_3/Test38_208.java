package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_208 {
    private final Production38_208 production = new Production38_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}