package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_131 {
    private final Production65_131 production = new Production65_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}