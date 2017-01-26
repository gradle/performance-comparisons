package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_425 {
    private final Production5_425 production = new Production5_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}