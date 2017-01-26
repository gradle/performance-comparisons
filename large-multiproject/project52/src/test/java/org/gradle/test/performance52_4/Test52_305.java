package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_305 {
    private final Production52_305 production = new Production52_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}