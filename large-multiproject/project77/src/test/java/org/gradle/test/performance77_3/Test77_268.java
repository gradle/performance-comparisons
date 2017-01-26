package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_268 {
    private final Production77_268 production = new Production77_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}