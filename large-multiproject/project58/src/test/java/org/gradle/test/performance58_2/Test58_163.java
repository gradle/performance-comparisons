package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_163 {
    private final Production58_163 production = new Production58_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}