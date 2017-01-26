package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_324 {
    private final Production99_324 production = new Production99_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}