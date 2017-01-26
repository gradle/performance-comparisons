package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_90 {
    private final Production52_90 production = new Production52_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}