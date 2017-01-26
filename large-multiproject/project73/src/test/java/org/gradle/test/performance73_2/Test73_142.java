package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_142 {
    private final Production73_142 production = new Production73_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}