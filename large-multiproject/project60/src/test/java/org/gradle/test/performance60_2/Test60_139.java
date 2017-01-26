package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_139 {
    private final Production60_139 production = new Production60_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}