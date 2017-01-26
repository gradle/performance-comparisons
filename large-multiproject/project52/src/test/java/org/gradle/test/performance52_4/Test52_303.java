package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_303 {
    private final Production52_303 production = new Production52_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}