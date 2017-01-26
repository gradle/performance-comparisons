package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_83 {
    private final Production73_83 production = new Production73_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}