package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_341 {
    private final Production65_341 production = new Production65_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}