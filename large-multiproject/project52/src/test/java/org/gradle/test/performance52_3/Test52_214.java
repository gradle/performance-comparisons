package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_214 {
    private final Production52_214 production = new Production52_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}