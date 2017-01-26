package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_476 {
    private final Production65_476 production = new Production65_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}