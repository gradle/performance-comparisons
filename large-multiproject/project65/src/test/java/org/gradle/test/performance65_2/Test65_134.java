package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_134 {
    private final Production65_134 production = new Production65_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}