package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_464 {
    private final Production60_464 production = new Production60_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}