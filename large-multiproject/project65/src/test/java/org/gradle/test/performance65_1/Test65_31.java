package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_31 {
    private final Production65_31 production = new Production65_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}