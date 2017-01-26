package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_183 {
    private final Production56_183 production = new Production56_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}