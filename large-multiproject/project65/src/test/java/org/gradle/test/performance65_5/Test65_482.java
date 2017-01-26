package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_482 {
    private final Production65_482 production = new Production65_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}