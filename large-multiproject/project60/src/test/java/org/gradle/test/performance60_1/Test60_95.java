package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_95 {
    private final Production60_95 production = new Production60_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}