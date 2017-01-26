package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_74 {
    private final Production77_74 production = new Production77_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}