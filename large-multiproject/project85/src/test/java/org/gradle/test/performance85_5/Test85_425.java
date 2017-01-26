package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_425 {
    private final Production85_425 production = new Production85_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}