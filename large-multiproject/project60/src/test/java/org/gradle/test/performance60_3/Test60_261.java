package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_261 {
    private final Production60_261 production = new Production60_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}