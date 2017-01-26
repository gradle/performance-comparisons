package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_213 {
    private final Production38_213 production = new Production38_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}