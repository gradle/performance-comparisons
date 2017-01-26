package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_358 {
    private final Production65_358 production = new Production65_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}