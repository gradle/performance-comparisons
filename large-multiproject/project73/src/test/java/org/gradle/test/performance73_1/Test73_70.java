package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_70 {
    private final Production73_70 production = new Production73_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}