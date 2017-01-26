package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_146 {
    private final Production38_146 production = new Production38_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}