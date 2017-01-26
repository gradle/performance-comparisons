package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_174 {
    private final Production60_174 production = new Production60_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}