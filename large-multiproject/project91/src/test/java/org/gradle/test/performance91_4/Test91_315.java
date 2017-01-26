package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_315 {
    private final Production91_315 production = new Production91_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}