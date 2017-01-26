package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_54 {
    private final Production38_54 production = new Production38_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}