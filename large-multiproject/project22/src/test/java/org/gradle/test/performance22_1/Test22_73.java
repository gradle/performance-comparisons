package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_73 {
    private final Production22_73 production = new Production22_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}