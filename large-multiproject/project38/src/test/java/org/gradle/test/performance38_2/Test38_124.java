package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_124 {
    private final Production38_124 production = new Production38_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}