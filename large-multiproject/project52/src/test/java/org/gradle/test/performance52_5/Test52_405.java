package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_405 {
    private final Production52_405 production = new Production52_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}