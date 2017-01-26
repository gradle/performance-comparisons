package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_313 {
    private final Production52_313 production = new Production52_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}