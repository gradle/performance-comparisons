package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_421 {
    private final Production60_421 production = new Production60_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}