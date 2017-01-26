package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_457 {
    private final Production22_457 production = new Production22_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}