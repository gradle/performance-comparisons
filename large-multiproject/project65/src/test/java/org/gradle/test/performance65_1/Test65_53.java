package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_53 {
    private final Production65_53 production = new Production65_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}