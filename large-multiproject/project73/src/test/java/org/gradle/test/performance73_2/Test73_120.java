package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_120 {
    private final Production73_120 production = new Production73_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}