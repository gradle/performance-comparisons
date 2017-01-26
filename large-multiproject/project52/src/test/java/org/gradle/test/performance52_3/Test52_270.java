package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_270 {
    private final Production52_270 production = new Production52_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}