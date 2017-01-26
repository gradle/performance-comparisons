package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_307 {
    private final Production65_307 production = new Production65_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}