package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_466 {
    private final Production52_466 production = new Production52_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}