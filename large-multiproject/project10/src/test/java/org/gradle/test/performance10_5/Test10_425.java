package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_425 {
    private final Production10_425 production = new Production10_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}