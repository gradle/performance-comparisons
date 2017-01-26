package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_63 {
    private final Production60_63 production = new Production60_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}