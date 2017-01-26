package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_419 {
    private final Production73_419 production = new Production73_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}