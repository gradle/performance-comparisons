package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_183 {
    private final Production52_183 production = new Production52_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}