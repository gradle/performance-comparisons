package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_379 {
    private final Production65_379 production = new Production65_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}