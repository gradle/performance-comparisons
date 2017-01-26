package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_425 {
    private final Production92_425 production = new Production92_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}