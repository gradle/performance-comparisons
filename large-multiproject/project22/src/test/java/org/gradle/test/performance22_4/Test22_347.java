package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_347 {
    private final Production22_347 production = new Production22_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}