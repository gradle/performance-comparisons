package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_122 {
    private final Production26_122 production = new Production26_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}