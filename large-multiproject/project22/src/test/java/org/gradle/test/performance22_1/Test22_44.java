package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_44 {
    private final Production22_44 production = new Production22_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}