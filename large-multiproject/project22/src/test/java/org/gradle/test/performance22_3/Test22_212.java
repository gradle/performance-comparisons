package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_212 {
    private final Production22_212 production = new Production22_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}