package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_329 {
    private final Production65_329 production = new Production65_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}