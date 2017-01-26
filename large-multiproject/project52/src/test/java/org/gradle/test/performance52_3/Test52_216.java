package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_216 {
    private final Production52_216 production = new Production52_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}