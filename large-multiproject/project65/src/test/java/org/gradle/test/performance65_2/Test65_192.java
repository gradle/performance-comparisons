package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_192 {
    private final Production65_192 production = new Production65_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}