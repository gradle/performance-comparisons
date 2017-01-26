package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_193 {
    private final Production60_193 production = new Production60_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}