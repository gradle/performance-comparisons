package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_6 {
    private final Production60_6 production = new Production60_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}