package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_356 {
    private final Production77_356 production = new Production77_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}