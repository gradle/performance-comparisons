package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_216 {
    private final Production65_216 production = new Production65_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}