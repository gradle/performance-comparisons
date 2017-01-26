package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_272 {
    private final Production60_272 production = new Production60_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}