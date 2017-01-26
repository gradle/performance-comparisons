package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_172 {
    private final Production22_172 production = new Production22_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}