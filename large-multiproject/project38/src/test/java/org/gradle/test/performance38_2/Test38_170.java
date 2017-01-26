package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_170 {
    private final Production38_170 production = new Production38_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}