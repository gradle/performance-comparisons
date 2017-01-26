package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_419 {
    private final Production65_419 production = new Production65_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}