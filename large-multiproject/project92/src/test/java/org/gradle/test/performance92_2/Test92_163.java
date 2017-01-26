package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_163 {
    private final Production92_163 production = new Production92_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}