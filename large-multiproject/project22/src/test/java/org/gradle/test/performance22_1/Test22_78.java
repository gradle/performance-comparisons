package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_78 {
    private final Production22_78 production = new Production22_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}