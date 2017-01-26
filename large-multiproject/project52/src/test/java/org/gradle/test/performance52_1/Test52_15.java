package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_15 {
    private final Production52_15 production = new Production52_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}