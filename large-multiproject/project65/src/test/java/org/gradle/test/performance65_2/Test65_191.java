package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_191 {
    private final Production65_191 production = new Production65_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}