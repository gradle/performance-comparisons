package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_165 {
    private final Production73_165 production = new Production73_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}