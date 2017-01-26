package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_69 {
    private final Production38_69 production = new Production38_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}