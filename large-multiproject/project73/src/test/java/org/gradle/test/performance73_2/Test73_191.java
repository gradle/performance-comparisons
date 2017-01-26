package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_191 {
    private final Production73_191 production = new Production73_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}