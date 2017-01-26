package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_100 {
    private final Production22_100 production = new Production22_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}