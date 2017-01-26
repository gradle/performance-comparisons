package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_464 {
    private final Production65_464 production = new Production65_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}