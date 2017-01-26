package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_345 {
    private final Production65_345 production = new Production65_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}