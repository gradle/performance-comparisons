package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_88 {
    private final Production22_88 production = new Production22_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}