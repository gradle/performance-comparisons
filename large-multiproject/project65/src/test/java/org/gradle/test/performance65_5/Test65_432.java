package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_432 {
    private final Production65_432 production = new Production65_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}