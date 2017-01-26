package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_474 {
    private final Production65_474 production = new Production65_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}