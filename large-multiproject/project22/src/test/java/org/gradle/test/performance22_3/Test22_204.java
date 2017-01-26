package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_204 {
    private final Production22_204 production = new Production22_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}