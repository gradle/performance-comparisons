package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_64 {
    private final Production73_64 production = new Production73_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}