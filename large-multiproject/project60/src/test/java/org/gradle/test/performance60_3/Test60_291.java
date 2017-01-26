package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_291 {
    private final Production60_291 production = new Production60_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}