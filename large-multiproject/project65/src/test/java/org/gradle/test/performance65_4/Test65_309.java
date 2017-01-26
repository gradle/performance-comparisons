package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_309 {
    private final Production65_309 production = new Production65_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}