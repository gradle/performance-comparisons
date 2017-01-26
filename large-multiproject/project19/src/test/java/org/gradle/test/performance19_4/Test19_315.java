package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_315 {
    private final Production19_315 production = new Production19_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}