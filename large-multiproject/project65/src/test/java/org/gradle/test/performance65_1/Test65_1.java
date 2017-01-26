package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_1 {
    private final Production65_1 production = new Production65_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}