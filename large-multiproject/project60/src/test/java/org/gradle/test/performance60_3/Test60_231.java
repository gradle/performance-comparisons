package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_231 {
    private final Production60_231 production = new Production60_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}