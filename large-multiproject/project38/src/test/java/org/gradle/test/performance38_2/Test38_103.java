package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_103 {
    private final Production38_103 production = new Production38_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}