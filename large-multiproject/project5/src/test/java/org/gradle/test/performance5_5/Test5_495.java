package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_495 {
    private final Production5_495 production = new Production5_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}