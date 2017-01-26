package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_339 {
    private final Production73_339 production = new Production73_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}