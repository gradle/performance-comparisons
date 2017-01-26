package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_300 {
    private final Production65_300 production = new Production65_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}