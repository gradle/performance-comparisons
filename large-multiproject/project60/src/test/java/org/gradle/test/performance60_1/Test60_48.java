package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_48 {
    private final Production60_48 production = new Production60_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}