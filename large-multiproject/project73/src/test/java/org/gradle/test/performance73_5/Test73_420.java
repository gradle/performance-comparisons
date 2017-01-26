package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_420 {
    private final Production73_420 production = new Production73_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}