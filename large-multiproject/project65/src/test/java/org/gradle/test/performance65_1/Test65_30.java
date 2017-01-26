package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_30 {
    private final Production65_30 production = new Production65_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}