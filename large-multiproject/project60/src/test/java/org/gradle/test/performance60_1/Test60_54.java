package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_54 {
    private final Production60_54 production = new Production60_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}