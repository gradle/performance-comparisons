package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_315 {
    private final Production65_315 production = new Production65_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}