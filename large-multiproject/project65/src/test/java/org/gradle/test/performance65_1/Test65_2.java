package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_2 {
    private final Production65_2 production = new Production65_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}