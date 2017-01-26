package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_353 {
    private final Production56_353 production = new Production56_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}