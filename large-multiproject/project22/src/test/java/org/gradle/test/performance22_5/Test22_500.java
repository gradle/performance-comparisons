package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_500 {
    private final Production22_500 production = new Production22_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}