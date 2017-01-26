package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_127 {
    private final Production65_127 production = new Production65_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}