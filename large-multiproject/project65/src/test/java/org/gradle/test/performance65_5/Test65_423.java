package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_423 {
    private final Production65_423 production = new Production65_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}