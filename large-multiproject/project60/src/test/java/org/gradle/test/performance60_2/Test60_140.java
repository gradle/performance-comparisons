package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_140 {
    private final Production60_140 production = new Production60_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}