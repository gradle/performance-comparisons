package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_116 {
    private final Production38_116 production = new Production38_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}