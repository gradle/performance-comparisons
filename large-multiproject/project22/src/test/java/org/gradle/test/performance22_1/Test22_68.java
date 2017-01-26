package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_68 {
    private final Production22_68 production = new Production22_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}