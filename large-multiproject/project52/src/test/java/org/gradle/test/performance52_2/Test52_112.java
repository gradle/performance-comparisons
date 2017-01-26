package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_112 {
    private final Production52_112 production = new Production52_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}