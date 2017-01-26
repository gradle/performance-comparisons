package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_315 {
    private final Production45_315 production = new Production45_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}