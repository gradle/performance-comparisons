package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_384 {
    private final Production38_384 production = new Production38_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}