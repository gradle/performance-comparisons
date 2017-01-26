package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_350 {
    private final Production22_350 production = new Production22_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}