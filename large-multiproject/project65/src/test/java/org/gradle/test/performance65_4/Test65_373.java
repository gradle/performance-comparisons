package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_373 {
    private final Production65_373 production = new Production65_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}