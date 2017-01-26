package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_91 {
    private final Production77_91 production = new Production77_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}