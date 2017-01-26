package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_268 {
    private final Production22_268 production = new Production22_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}