package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_81 {
    private final Production60_81 production = new Production60_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}