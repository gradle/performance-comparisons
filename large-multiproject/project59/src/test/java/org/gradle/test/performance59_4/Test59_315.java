package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_315 {
    private final Production59_315 production = new Production59_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}