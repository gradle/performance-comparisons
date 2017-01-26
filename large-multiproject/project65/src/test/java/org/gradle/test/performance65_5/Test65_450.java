package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_450 {
    private final Production65_450 production = new Production65_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}