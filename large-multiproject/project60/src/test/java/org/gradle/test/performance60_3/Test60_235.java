package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_235 {
    private final Production60_235 production = new Production60_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}