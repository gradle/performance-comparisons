package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_45 {
    private final Production22_45 production = new Production22_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}