package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_5 {
    private final Production60_5 production = new Production60_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}