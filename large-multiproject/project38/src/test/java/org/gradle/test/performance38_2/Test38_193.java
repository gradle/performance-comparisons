package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_193 {
    private final Production38_193 production = new Production38_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}