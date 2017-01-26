package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_481 {
    private final Production52_481 production = new Production52_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}