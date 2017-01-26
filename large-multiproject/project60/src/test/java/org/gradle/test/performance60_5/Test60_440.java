package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_440 {
    private final Production60_440 production = new Production60_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}