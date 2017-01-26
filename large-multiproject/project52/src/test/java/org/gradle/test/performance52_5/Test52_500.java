package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_500 {
    private final Production52_500 production = new Production52_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}