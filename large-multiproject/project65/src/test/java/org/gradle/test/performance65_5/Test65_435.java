package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_435 {
    private final Production65_435 production = new Production65_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}