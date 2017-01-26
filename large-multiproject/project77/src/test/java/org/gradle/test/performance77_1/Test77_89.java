package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_89 {
    private final Production77_89 production = new Production77_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}