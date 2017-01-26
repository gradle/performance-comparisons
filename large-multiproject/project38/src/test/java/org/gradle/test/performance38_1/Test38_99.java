package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_99 {
    private final Production38_99 production = new Production38_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}