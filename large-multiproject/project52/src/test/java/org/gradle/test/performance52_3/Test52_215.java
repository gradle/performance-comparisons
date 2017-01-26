package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_215 {
    private final Production52_215 production = new Production52_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}