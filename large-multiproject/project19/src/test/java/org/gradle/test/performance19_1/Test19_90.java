package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_90 {
    private final Production19_90 production = new Production19_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}