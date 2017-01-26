package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_158 {
    private final Production38_158 production = new Production38_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}