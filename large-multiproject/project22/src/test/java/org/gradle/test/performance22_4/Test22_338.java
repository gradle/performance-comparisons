package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_338 {
    private final Production22_338 production = new Production22_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}