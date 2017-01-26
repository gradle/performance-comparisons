package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_424 {
    private final Production65_424 production = new Production65_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}