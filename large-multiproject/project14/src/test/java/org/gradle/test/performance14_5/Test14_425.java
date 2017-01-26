package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_425 {
    private final Production14_425 production = new Production14_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}