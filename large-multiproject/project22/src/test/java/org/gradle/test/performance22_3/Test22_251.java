package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_251 {
    private final Production22_251 production = new Production22_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}