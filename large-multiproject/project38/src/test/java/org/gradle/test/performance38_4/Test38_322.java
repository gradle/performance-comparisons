package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_322 {
    private final Production38_322 production = new Production38_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}