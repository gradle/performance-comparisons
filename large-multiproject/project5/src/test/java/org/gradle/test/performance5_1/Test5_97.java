package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_97 {
    private final Production5_97 production = new Production5_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}