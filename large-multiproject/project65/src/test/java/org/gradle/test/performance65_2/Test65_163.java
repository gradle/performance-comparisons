package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_163 {
    private final Production65_163 production = new Production65_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}