package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_57 {
    private final Production65_57 production = new Production65_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}