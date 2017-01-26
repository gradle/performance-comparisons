package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_302 {
    private final Production65_302 production = new Production65_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}