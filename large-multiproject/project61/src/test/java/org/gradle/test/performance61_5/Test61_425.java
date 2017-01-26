package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_425 {
    private final Production61_425 production = new Production61_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}