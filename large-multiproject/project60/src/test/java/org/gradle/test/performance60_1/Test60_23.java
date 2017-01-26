package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_23 {
    private final Production60_23 production = new Production60_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}