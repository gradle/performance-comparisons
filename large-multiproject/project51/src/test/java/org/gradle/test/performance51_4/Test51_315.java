package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_315 {
    private final Production51_315 production = new Production51_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}