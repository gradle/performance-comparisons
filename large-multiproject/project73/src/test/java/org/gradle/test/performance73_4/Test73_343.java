package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_343 {
    private final Production73_343 production = new Production73_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}