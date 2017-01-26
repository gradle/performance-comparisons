package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_149 {
    private final Production38_149 production = new Production38_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}