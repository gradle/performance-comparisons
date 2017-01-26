package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_4 {
    private final Production65_4 production = new Production65_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}