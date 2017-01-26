package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_301 {
    private final Production38_301 production = new Production38_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}