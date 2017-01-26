package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_425 {
    private final Production77_425 production = new Production77_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}