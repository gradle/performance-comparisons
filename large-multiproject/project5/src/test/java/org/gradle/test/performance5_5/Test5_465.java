package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_465 {
    private final Production5_465 production = new Production5_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}