package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_33 {
    private final Production52_33 production = new Production52_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}