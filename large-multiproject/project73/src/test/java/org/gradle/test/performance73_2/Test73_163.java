package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_163 {
    private final Production73_163 production = new Production73_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}