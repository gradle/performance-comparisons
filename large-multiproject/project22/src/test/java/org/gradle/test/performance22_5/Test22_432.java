package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_432 {
    private final Production22_432 production = new Production22_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}