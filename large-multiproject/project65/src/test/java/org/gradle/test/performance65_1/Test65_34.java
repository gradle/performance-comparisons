package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_34 {
    private final Production65_34 production = new Production65_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}