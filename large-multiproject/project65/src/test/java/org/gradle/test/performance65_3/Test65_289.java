package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_289 {
    private final Production65_289 production = new Production65_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}