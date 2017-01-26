package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_4 {
    private final Production60_4 production = new Production60_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}