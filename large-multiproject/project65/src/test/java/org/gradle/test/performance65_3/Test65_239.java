package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_239 {
    private final Production65_239 production = new Production65_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}