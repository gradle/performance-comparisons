package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_255 {
    private final Production22_255 production = new Production22_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}