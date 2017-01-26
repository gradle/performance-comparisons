package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_337 {
    private final Production65_337 production = new Production65_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}