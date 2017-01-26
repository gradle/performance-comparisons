package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_471 {
    private final Production65_471 production = new Production65_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}