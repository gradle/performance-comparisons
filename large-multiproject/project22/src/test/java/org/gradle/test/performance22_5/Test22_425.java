package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_425 {
    private final Production22_425 production = new Production22_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}