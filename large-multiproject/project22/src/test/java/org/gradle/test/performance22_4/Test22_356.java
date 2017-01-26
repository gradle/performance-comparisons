package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_356 {
    private final Production22_356 production = new Production22_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}