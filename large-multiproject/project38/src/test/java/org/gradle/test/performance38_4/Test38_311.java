package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_311 {
    private final Production38_311 production = new Production38_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}