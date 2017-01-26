package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_41 {
    private final Production22_41 production = new Production22_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}