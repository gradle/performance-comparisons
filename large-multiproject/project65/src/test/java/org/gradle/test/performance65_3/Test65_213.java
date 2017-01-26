package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_213 {
    private final Production65_213 production = new Production65_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}