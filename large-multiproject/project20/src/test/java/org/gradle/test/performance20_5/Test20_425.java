package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_425 {
    private final Production20_425 production = new Production20_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}