package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_322 {
    private final Production52_322 production = new Production52_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}