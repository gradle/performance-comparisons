package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_112 {
    private final Production22_112 production = new Production22_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}