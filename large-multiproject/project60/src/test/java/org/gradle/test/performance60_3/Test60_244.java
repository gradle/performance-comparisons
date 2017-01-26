package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_244 {
    private final Production60_244 production = new Production60_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}