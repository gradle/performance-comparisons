package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_470 {
    private final Production65_470 production = new Production65_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}