package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_445 {
    private final Production22_445 production = new Production22_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}