package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_246 {
    private final Production65_246 production = new Production65_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}