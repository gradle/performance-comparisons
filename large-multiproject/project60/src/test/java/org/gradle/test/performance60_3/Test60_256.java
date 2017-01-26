package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_256 {
    private final Production60_256 production = new Production60_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}