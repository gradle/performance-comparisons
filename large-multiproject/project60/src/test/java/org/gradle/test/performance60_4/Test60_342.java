package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_342 {
    private final Production60_342 production = new Production60_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}