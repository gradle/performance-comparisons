package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_204 {
    private final Production65_204 production = new Production65_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}