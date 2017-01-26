package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_5 {
    private final Production65_5 production = new Production65_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}