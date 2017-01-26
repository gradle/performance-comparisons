package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_294 {
    private final Production22_294 production = new Production22_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}