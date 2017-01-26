package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_225 {
    private final Production5_225 production = new Production5_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}