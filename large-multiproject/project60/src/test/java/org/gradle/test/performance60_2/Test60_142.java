package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_142 {
    private final Production60_142 production = new Production60_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}