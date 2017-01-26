package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_302 {
    private final Production38_302 production = new Production38_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}