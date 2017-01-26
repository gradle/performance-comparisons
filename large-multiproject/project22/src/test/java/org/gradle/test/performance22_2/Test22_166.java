package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_166 {
    private final Production22_166 production = new Production22_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}