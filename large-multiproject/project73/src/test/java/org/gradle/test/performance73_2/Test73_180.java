package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_180 {
    private final Production73_180 production = new Production73_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}