package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_89 {
    private final Production22_89 production = new Production22_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}