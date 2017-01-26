package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_15 {
    private final Production60_15 production = new Production60_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}