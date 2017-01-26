package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_473 {
    private final Production73_473 production = new Production73_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}