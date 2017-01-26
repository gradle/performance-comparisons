package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_16 {
    private final Production65_16 production = new Production65_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}