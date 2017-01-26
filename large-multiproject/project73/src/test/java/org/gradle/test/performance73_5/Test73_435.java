package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_435 {
    private final Production73_435 production = new Production73_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}