package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_267 {
    private final Production5_267 production = new Production5_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}