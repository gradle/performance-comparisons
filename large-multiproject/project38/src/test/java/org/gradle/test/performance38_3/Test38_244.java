package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_244 {
    private final Production38_244 production = new Production38_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}