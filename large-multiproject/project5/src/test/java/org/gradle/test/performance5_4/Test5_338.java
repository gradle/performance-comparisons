package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_338 {
    private final Production5_338 production = new Production5_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}