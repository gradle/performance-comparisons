package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_457 {
    private final Production52_457 production = new Production52_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}