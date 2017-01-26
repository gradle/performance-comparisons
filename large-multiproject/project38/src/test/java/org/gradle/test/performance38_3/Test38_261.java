package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_261 {
    private final Production38_261 production = new Production38_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}