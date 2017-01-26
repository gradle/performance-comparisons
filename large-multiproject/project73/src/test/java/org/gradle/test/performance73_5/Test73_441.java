package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_441 {
    private final Production73_441 production = new Production73_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}