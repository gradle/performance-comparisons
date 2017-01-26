package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_472 {
    private final Production60_472 production = new Production60_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}