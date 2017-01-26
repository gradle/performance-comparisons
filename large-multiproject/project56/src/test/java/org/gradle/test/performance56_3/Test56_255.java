package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_255 {
    private final Production56_255 production = new Production56_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}