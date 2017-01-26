package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_465 {
    private final Production22_465 production = new Production22_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}