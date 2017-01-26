package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_210 {
    private final Production65_210 production = new Production65_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}