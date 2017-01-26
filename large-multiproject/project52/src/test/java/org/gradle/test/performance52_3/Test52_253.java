package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_253 {
    private final Production52_253 production = new Production52_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}