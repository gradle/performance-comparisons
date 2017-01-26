package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_268 {
    private final Production65_268 production = new Production65_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}