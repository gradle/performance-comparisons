package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_113 {
    private final Production60_113 production = new Production60_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}