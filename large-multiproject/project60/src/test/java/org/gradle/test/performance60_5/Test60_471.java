package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_471 {
    private final Production60_471 production = new Production60_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}