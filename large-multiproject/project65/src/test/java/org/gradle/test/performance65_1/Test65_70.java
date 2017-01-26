package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_70 {
    private final Production65_70 production = new Production65_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}