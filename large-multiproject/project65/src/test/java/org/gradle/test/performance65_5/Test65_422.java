package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_422 {
    private final Production65_422 production = new Production65_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}