package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_310 {
    private final Production65_310 production = new Production65_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}