package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_254 {
    private final Production65_254 production = new Production65_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}