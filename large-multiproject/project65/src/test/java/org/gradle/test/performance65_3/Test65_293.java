package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_293 {
    private final Production65_293 production = new Production65_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}