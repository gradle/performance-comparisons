package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_46 {
    private final Production38_46 production = new Production38_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}