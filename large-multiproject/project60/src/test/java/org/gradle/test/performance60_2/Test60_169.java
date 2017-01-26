package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_169 {
    private final Production60_169 production = new Production60_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}