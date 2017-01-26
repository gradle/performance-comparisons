package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_324 {
    private final Production63_324 production = new Production63_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}