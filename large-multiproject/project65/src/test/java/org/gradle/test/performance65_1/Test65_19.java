package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_19 {
    private final Production65_19 production = new Production65_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}