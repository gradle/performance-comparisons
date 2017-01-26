package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_134 {
    private final Production22_134 production = new Production22_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}