package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_291 {
    private final Production65_291 production = new Production65_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}