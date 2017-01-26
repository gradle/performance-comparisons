package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_176 {
    private final Production60_176 production = new Production60_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}