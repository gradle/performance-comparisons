package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_150 {
    private final Production73_150 production = new Production73_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}