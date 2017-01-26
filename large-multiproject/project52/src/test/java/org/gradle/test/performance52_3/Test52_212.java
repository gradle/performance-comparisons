package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_212 {
    private final Production52_212 production = new Production52_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}