package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_84 {
    private final Production65_84 production = new Production65_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}