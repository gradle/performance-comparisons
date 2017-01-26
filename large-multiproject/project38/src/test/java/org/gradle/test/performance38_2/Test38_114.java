package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_114 {
    private final Production38_114 production = new Production38_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}