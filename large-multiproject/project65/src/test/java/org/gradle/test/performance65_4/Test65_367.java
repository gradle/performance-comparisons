package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_367 {
    private final Production65_367 production = new Production65_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}