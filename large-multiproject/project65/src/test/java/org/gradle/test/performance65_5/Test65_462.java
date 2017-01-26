package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_462 {
    private final Production65_462 production = new Production65_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}