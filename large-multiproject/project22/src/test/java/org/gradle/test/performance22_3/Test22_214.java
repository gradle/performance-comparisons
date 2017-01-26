package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_214 {
    private final Production22_214 production = new Production22_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}