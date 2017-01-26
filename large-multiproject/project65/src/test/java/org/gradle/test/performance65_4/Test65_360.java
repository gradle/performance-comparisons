package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_360 {
    private final Production65_360 production = new Production65_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}