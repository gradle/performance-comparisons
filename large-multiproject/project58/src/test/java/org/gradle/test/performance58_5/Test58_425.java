package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_425 {
    private final Production58_425 production = new Production58_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}