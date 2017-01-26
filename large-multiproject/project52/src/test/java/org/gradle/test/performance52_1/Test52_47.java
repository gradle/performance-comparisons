package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_47 {
    private final Production52_47 production = new Production52_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}