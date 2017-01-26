package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_105 {
    private final Production60_105 production = new Production60_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}