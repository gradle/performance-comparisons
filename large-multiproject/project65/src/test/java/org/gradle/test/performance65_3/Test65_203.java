package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_203 {
    private final Production65_203 production = new Production65_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}