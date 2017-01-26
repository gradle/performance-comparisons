package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_371 {
    private final Production60_371 production = new Production60_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}