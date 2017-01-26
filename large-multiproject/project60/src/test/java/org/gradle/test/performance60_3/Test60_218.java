package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_218 {
    private final Production60_218 production = new Production60_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}