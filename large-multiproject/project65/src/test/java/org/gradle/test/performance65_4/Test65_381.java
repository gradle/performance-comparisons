package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_381 {
    private final Production65_381 production = new Production65_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}