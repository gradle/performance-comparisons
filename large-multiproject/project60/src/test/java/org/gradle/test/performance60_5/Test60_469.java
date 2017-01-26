package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_469 {
    private final Production60_469 production = new Production60_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}