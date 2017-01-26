package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_137 {
    private final Production65_137 production = new Production65_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}