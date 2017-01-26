package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_469 {
    private final Production73_469 production = new Production73_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}