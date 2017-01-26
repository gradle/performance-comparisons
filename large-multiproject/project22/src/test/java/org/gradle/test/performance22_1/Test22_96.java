package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_96 {
    private final Production22_96 production = new Production22_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}