package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_28 {
    private final Production65_28 production = new Production65_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}