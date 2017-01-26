package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_497 {
    private final Production65_497 production = new Production65_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}