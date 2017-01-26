package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_133 {
    private final Production60_133 production = new Production60_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}