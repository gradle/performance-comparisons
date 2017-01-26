package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_173 {
    private final Production60_173 production = new Production60_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}