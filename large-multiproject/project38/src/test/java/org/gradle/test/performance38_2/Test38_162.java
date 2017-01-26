package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_162 {
    private final Production38_162 production = new Production38_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}