package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_392 {
    private final Production52_392 production = new Production52_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}