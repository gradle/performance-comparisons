package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_241 {
    private final Production52_241 production = new Production52_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}