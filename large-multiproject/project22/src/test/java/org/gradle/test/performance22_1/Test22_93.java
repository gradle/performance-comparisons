package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_93 {
    private final Production22_93 production = new Production22_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}