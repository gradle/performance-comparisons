package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_230 {
    private final Production52_230 production = new Production52_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}