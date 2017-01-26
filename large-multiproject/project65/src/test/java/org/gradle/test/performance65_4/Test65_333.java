package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_333 {
    private final Production65_333 production = new Production65_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}