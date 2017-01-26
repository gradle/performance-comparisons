package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_436 {
    private final Production60_436 production = new Production60_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}