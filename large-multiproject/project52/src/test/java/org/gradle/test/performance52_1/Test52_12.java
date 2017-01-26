package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_12 {
    private final Production52_12 production = new Production52_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}