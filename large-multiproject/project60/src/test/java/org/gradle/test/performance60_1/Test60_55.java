package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_55 {
    private final Production60_55 production = new Production60_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}