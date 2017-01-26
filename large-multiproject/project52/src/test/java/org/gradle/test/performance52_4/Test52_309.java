package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_309 {
    private final Production52_309 production = new Production52_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}