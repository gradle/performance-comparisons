package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_83 {
    private final Production60_83 production = new Production60_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}