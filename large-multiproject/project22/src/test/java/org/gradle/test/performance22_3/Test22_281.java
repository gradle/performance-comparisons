package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_281 {
    private final Production22_281 production = new Production22_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}