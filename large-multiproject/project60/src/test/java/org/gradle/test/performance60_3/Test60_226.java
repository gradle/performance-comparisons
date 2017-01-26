package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_226 {
    private final Production60_226 production = new Production60_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}