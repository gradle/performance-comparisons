package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_492 {
    private final Production65_492 production = new Production65_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}