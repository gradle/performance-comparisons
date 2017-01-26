package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_323 {
    private final Production22_323 production = new Production22_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}