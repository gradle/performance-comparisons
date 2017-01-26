package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_109 {
    private final Production65_109 production = new Production65_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}