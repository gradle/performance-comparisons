package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_315 {
    private final Production94_315 production = new Production94_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}