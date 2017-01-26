package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_265 {
    private final Production65_265 production = new Production65_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}