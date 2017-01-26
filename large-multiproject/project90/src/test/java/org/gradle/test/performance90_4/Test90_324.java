package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_324 {
    private final Production90_324 production = new Production90_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}