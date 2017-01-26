package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_109 {
    private final Production60_109 production = new Production60_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}