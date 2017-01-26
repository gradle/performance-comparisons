package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_49 {
    private final Production5_49 production = new Production5_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}