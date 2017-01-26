package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_301 {
    private final Production19_301 production = new Production19_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}