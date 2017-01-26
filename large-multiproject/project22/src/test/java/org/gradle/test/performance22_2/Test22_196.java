package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_196 {
    private final Production22_196 production = new Production22_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}