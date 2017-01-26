package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_193 {
    private final Production73_193 production = new Production73_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}