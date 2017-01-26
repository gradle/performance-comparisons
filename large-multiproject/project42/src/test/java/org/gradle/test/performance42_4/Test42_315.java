package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_315 {
    private final Production42_315 production = new Production42_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}