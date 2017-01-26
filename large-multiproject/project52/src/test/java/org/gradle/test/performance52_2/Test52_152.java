package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_152 {
    private final Production52_152 production = new Production52_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}