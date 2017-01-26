package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_38 {
    private final Production22_38 production = new Production22_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}