package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_269 {
    private final Production56_269 production = new Production56_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}