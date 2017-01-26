package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_318 {
    private final Production73_318 production = new Production73_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}