package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_217 {
    private final Production60_217 production = new Production60_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}