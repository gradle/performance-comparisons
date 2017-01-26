package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_308 {
    private final Production60_308 production = new Production60_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}