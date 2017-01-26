package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_9 {
    private final Production22_9 production = new Production22_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}