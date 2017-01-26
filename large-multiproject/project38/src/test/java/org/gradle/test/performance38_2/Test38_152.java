package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_152 {
    private final Production38_152 production = new Production38_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}