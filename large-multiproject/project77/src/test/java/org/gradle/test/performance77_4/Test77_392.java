package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_392 {
    private final Production77_392 production = new Production77_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}