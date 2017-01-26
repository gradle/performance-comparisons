package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_282 {
    private final Production5_282 production = new Production5_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}