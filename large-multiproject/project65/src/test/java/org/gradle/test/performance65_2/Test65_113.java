package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_113 {
    private final Production65_113 production = new Production65_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}