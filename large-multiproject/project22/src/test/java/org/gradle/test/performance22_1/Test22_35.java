package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_35 {
    private final Production22_35 production = new Production22_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}