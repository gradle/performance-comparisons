package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_73 {
    private final Production56_73 production = new Production56_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}