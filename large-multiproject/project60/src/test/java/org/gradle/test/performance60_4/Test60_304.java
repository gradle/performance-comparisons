package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_304 {
    private final Production60_304 production = new Production60_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}