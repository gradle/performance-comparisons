package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_315 {
    private final Production27_315 production = new Production27_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}