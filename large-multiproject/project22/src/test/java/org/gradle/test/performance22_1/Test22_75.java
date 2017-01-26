package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_75 {
    private final Production22_75 production = new Production22_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}