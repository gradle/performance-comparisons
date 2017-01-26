package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_188 {
    private final Production77_188 production = new Production77_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}