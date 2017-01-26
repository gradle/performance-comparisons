package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_488 {
    private final Production65_488 production = new Production65_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}