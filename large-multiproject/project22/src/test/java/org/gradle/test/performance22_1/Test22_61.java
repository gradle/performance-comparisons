package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_61 {
    private final Production22_61 production = new Production22_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}