package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_46 {
    private final Production65_46 production = new Production65_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}