package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_301 {
    private final Production60_301 production = new Production60_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}