package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_171 {
    private final Production65_171 production = new Production65_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}