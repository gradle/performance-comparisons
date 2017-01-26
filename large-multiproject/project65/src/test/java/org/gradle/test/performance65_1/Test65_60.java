package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_60 {
    private final Production65_60 production = new Production65_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}