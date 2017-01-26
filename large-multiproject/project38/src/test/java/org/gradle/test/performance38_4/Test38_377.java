package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_377 {
    private final Production38_377 production = new Production38_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}