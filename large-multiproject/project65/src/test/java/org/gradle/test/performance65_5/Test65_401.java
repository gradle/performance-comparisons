package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_401 {
    private final Production65_401 production = new Production65_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}