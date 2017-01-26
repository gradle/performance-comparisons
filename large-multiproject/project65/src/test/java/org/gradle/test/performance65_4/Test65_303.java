package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_303 {
    private final Production65_303 production = new Production65_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}