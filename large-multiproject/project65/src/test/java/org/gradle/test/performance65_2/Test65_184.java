package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_184 {
    private final Production65_184 production = new Production65_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}