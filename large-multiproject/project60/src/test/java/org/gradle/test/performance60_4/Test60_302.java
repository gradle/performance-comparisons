package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_302 {
    private final Production60_302 production = new Production60_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}