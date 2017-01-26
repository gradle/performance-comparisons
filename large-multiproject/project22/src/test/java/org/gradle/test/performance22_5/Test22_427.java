package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_427 {
    private final Production22_427 production = new Production22_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}