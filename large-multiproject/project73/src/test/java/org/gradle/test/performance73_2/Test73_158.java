package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_158 {
    private final Production73_158 production = new Production73_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}