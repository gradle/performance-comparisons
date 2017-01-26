package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_349 {
    private final Production60_349 production = new Production60_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}