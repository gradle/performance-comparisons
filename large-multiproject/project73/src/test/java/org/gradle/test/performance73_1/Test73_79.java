package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_79 {
    private final Production73_79 production = new Production73_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}