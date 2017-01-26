package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_205 {
    private final Production38_205 production = new Production38_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}