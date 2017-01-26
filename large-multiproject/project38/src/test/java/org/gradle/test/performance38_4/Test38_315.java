package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_315 {
    private final Production38_315 production = new Production38_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}