package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_306 {
    private final Production65_306 production = new Production65_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}