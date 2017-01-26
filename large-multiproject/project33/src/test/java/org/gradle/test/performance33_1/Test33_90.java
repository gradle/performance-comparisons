package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_90 {
    private final Production33_90 production = new Production33_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}