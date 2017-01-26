package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_343 {
    private final Production2_343 production = new Production2_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}