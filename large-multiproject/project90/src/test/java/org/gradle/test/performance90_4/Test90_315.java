package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_315 {
    private final Production90_315 production = new Production90_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}