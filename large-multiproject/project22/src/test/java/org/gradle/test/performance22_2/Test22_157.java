package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_157 {
    private final Production22_157 production = new Production22_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}