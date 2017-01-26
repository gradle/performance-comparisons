package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_315 {
    private final Production52_315 production = new Production52_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}