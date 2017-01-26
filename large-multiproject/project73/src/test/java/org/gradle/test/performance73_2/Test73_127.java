package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_127 {
    private final Production73_127 production = new Production73_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}