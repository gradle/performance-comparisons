package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_138 {
    private final Production52_138 production = new Production52_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}