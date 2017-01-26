package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_182 {
    private final Production65_182 production = new Production65_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}