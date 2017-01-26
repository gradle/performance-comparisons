package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_425 {
    private final Production18_425 production = new Production18_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}