package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_64 {
    private final Production65_64 production = new Production65_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}