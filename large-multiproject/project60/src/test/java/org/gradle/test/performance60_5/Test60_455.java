package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_455 {
    private final Production60_455 production = new Production60_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}