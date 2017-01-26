package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_315 {
    private final Production99_315 production = new Production99_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}