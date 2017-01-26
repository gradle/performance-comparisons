package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_68 {
    private final Production77_68 production = new Production77_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}