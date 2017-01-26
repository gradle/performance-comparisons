package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_209 {
    private final Production22_209 production = new Production22_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}