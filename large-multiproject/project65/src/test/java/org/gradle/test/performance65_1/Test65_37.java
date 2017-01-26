package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_37 {
    private final Production65_37 production = new Production65_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}