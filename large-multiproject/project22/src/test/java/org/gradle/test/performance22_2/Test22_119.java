package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_119 {
    private final Production22_119 production = new Production22_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}