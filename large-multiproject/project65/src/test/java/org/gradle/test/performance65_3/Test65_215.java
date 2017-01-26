package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_215 {
    private final Production65_215 production = new Production65_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}