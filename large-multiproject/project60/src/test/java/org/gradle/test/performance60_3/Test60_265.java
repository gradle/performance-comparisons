package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_265 {
    private final Production60_265 production = new Production60_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}