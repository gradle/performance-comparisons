package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_97 {
    private final Production22_97 production = new Production22_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}