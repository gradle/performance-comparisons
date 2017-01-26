package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_395 {
    private final Production65_395 production = new Production65_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}