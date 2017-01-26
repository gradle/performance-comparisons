package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_105 {
    private final Production38_105 production = new Production38_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}