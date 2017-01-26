package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_32 {
    private final Production73_32 production = new Production73_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}