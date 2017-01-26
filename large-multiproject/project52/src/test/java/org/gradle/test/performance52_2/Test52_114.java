package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_114 {
    private final Production52_114 production = new Production52_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}