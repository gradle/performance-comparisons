package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_2 {
    private final Production22_2 production = new Production22_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}