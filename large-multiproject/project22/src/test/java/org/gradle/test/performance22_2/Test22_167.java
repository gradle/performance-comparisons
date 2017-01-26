package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_167 {
    private final Production22_167 production = new Production22_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}