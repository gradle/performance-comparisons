package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_213 {
    private final Production73_213 production = new Production73_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}