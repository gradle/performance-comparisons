package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_180 {
    private final Production60_180 production = new Production60_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}