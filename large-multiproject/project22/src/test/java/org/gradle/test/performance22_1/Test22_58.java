package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_58 {
    private final Production22_58 production = new Production22_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}