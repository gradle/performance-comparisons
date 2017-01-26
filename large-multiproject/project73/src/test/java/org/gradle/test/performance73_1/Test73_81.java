package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_81 {
    private final Production73_81 production = new Production73_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}