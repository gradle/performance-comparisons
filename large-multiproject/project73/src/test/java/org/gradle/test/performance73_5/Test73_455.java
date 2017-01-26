package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_455 {
    private final Production73_455 production = new Production73_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}