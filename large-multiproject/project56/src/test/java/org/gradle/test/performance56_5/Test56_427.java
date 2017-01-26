package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_427 {
    private final Production56_427 production = new Production56_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}