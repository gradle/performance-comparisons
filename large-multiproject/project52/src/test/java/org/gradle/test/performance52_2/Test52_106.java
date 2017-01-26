package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_106 {
    private final Production52_106 production = new Production52_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}