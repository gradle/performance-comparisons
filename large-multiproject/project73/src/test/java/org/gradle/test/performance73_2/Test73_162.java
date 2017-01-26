package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_162 {
    private final Production73_162 production = new Production73_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}