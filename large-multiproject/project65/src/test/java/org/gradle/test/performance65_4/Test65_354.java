package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_354 {
    private final Production65_354 production = new Production65_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}