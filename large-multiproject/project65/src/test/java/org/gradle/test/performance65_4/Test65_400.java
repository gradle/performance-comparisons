package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_400 {
    private final Production65_400 production = new Production65_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}