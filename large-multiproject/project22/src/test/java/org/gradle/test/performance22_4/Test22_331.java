package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_331 {
    private final Production22_331 production = new Production22_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}