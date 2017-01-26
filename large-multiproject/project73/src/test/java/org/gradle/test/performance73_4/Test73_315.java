package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_315 {
    private final Production73_315 production = new Production73_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}