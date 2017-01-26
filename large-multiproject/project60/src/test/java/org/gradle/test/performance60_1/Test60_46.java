package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_46 {
    private final Production60_46 production = new Production60_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}