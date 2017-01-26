package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_392 {
    private final Production22_392 production = new Production22_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}