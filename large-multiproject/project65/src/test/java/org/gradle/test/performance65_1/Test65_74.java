package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_74 {
    private final Production65_74 production = new Production65_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}