package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_200 {
    private final Production22_200 production = new Production22_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}