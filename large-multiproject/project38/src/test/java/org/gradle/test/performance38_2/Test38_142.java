package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_142 {
    private final Production38_142 production = new Production38_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}