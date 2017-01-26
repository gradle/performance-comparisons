package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_244 {
    private final Production65_244 production = new Production65_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}