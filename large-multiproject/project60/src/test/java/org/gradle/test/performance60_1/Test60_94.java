package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_94 {
    private final Production60_94 production = new Production60_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}