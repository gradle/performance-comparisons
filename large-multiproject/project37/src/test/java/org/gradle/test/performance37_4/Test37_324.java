package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_324 {
    private final Production37_324 production = new Production37_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}