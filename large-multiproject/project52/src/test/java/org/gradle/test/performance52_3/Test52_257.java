package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_257 {
    private final Production52_257 production = new Production52_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}