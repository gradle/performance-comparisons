package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_3 {
    private final Production22_3 production = new Production22_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}