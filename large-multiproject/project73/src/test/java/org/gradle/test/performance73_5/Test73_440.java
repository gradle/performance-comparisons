package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_440 {
    private final Production73_440 production = new Production73_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}