package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_444 {
    private final Production5_444 production = new Production5_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}