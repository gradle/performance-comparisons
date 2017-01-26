package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_16 {
    private final Production73_16 production = new Production73_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}