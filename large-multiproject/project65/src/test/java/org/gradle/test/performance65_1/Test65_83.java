package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_83 {
    private final Production65_83 production = new Production65_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}