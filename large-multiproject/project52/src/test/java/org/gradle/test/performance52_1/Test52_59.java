package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_59 {
    private final Production52_59 production = new Production52_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}