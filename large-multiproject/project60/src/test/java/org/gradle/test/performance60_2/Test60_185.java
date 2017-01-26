package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_185 {
    private final Production60_185 production = new Production60_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}