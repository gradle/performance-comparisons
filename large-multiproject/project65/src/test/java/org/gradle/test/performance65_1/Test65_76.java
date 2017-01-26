package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_76 {
    private final Production65_76 production = new Production65_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}