package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_324 {
    private final Production73_324 production = new Production73_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}