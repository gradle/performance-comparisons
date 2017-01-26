package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_477 {
    private final Production65_477 production = new Production65_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}