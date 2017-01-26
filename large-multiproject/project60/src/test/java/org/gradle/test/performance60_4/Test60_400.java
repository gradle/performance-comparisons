package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_400 {
    private final Production60_400 production = new Production60_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}