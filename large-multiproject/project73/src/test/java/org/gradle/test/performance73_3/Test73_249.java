package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_249 {
    private final Production73_249 production = new Production73_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}