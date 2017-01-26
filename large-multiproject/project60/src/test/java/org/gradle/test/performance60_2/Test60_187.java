package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_187 {
    private final Production60_187 production = new Production60_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}