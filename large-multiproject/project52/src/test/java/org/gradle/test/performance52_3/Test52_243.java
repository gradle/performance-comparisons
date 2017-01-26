package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_243 {
    private final Production52_243 production = new Production52_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}