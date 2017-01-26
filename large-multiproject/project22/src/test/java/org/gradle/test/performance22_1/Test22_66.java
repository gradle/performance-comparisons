package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_66 {
    private final Production22_66 production = new Production22_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}