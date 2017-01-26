package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_246 {
    private final Production5_246 production = new Production5_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}