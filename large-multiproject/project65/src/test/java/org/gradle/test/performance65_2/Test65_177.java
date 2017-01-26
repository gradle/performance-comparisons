package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_177 {
    private final Production65_177 production = new Production65_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}