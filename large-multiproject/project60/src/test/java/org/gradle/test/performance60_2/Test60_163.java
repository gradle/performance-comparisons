package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_163 {
    private final Production60_163 production = new Production60_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}