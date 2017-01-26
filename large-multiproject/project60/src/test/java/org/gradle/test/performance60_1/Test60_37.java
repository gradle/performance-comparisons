package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_37 {
    private final Production60_37 production = new Production60_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}