package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_377 {
    private final Production65_377 production = new Production65_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}