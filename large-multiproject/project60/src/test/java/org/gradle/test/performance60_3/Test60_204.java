package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_204 {
    private final Production60_204 production = new Production60_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}