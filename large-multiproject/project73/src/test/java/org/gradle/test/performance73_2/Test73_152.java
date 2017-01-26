package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_152 {
    private final Production73_152 production = new Production73_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}