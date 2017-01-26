package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_84 {
    private final Production60_84 production = new Production60_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}