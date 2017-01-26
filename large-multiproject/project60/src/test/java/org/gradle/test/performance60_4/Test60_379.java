package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_379 {
    private final Production60_379 production = new Production60_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}