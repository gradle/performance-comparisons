package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_304 {
    private final Production65_304 production = new Production65_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}