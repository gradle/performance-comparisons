package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_206 {
    private final Production38_206 production = new Production38_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}