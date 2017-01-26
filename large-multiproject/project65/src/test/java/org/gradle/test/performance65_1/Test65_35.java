package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_35 {
    private final Production65_35 production = new Production65_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}