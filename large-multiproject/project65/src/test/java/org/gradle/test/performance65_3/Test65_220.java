package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_220 {
    private final Production65_220 production = new Production65_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}