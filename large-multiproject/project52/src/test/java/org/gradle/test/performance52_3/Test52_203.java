package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_203 {
    private final Production52_203 production = new Production52_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}