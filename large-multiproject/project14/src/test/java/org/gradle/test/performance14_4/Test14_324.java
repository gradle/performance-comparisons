package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_324 {
    private final Production14_324 production = new Production14_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}