package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_371 {
    private final Production65_371 production = new Production65_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}