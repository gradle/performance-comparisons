package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_57 {
    private final Production52_57 production = new Production52_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}