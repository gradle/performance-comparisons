package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_161 {
    private final Production38_161 production = new Production38_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}