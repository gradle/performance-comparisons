package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_150 {
    private final Production60_150 production = new Production60_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}