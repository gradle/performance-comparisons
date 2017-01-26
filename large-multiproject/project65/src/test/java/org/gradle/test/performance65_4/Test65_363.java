package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_363 {
    private final Production65_363 production = new Production65_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}