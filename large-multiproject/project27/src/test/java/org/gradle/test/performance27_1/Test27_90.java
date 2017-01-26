package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_90 {
    private final Production27_90 production = new Production27_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}