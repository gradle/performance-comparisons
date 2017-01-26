package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_99 {
    private final Production65_99 production = new Production65_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}