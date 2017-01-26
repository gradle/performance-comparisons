package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_396 {
    private final Production65_396 production = new Production65_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}