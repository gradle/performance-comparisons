package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_488 {
    private final Production73_488 production = new Production73_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}