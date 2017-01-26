package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_434 {
    private final Production65_434 production = new Production65_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}