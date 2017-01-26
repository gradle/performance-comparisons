package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_251 {
    private final Production77_251 production = new Production77_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}