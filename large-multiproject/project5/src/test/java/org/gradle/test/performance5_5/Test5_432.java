package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_432 {
    private final Production5_432 production = new Production5_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}