package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_243 {
    private final Production65_243 production = new Production65_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}