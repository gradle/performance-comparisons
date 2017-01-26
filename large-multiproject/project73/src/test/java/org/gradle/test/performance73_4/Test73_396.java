package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_396 {
    private final Production73_396 production = new Production73_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}