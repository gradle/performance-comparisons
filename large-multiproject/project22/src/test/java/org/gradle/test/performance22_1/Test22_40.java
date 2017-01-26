package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_40 {
    private final Production22_40 production = new Production22_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}