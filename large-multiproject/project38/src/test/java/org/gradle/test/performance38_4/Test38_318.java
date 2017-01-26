package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_318 {
    private final Production38_318 production = new Production38_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}