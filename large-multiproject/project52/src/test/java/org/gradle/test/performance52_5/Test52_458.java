package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_458 {
    private final Production52_458 production = new Production52_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}