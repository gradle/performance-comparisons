package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_80 {
    private final Production22_80 production = new Production22_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}