package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_90 {
    private final Production59_90 production = new Production59_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}