package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_235 {
    private final Production38_235 production = new Production38_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}