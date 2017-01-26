package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_79 {
    private final Production38_79 production = new Production38_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}