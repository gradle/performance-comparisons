package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_406 {
    private final Production22_406 production = new Production22_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}