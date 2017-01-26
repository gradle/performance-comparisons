package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_7 {
    private final Production60_7 production = new Production60_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}