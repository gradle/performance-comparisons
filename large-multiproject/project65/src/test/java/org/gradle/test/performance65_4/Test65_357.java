package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_357 {
    private final Production65_357 production = new Production65_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}