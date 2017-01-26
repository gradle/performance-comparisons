package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_315 {
    private final Production64_315 production = new Production64_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}