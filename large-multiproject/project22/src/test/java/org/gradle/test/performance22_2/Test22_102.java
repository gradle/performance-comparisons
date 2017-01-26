package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_102 {
    private final Production22_102 production = new Production22_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}