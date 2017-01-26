package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_334 {
    private final Production65_334 production = new Production65_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}