package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_315 {
    private final Production46_315 production = new Production46_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}