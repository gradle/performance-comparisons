package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_431 {
    private final Production65_431 production = new Production65_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}