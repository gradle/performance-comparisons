package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_188 {
    private final Production52_188 production = new Production52_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}