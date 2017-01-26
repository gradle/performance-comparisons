package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_154 {
    private final Production52_154 production = new Production52_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}