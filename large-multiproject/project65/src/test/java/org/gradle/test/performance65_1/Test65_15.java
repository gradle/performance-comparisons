package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_15 {
    private final Production65_15 production = new Production65_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}