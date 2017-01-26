package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_39 {
    private final Production5_39 production = new Production5_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}