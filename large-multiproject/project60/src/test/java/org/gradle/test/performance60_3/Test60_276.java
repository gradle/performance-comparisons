package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_276 {
    private final Production60_276 production = new Production60_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}