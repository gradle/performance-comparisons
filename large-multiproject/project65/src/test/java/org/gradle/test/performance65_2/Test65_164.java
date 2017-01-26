package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_164 {
    private final Production65_164 production = new Production65_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}