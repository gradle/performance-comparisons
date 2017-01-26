package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_77 {
    private final Production22_77 production = new Production22_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}