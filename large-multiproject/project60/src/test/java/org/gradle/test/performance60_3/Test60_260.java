package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_260 {
    private final Production60_260 production = new Production60_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}