package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_293 {
    private final Production77_293 production = new Production77_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}