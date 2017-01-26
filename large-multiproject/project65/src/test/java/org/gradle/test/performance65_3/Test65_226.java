package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_226 {
    private final Production65_226 production = new Production65_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}