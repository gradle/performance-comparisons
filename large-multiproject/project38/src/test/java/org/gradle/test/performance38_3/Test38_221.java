package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_221 {
    private final Production38_221 production = new Production38_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}