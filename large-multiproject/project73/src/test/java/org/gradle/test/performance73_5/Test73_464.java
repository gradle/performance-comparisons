package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_464 {
    private final Production73_464 production = new Production73_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}