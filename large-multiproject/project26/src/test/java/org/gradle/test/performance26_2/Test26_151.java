package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_151 {
    private final Production26_151 production = new Production26_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}