package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_36 {
    private final Production52_36 production = new Production52_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}