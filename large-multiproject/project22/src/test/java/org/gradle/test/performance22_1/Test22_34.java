package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_34 {
    private final Production22_34 production = new Production22_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}