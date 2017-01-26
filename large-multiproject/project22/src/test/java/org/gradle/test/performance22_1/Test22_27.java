package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_27 {
    private final Production22_27 production = new Production22_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}