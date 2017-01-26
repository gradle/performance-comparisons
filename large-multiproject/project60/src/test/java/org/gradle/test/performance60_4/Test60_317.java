package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_317 {
    private final Production60_317 production = new Production60_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}