package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_229 {
    private final Production77_229 production = new Production77_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}