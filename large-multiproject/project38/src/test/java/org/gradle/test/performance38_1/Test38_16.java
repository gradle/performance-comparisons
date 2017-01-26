package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_16 {
    private final Production38_16 production = new Production38_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}