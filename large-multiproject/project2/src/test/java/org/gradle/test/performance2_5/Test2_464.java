package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_464 {
    private final Production2_464 production = new Production2_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}