package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_57 {
    private final Production60_57 production = new Production60_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}