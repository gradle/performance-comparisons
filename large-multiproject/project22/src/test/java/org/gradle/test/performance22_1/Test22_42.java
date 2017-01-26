package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_42 {
    private final Production22_42 production = new Production22_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}