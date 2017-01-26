package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_163 {
    private final Production20_163 production = new Production20_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}