package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_315 {
    private final Production29_315 production = new Production29_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}