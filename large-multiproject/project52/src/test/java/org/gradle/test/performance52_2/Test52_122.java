package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_122 {
    private final Production52_122 production = new Production52_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}