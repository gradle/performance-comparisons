package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_18 {
    private final Production65_18 production = new Production65_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}