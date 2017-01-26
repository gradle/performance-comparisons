package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_315 {
    private final Production33_315 production = new Production33_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}