package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_90 {
    private final Production51_90 production = new Production51_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}