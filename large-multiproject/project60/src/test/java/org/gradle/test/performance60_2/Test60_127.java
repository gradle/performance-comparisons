package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_127 {
    private final Production60_127 production = new Production60_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}