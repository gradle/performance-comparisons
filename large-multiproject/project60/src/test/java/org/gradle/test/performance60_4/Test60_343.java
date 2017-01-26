package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_343 {
    private final Production60_343 production = new Production60_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}