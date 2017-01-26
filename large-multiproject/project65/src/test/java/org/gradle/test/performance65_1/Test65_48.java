package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_48 {
    private final Production65_48 production = new Production65_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}