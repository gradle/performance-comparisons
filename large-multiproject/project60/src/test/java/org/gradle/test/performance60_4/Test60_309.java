package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_309 {
    private final Production60_309 production = new Production60_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}