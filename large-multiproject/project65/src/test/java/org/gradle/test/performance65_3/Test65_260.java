package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_260 {
    private final Production65_260 production = new Production65_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}