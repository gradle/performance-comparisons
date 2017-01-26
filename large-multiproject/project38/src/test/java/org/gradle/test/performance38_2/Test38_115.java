package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_115 {
    private final Production38_115 production = new Production38_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}