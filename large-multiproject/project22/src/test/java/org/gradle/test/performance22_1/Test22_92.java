package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_92 {
    private final Production22_92 production = new Production22_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}