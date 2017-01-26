package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_87 {
    private final Production65_87 production = new Production65_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}