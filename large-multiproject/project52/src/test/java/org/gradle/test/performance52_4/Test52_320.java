package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_320 {
    private final Production52_320 production = new Production52_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}