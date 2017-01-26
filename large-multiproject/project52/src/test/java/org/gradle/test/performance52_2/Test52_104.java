package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_104 {
    private final Production52_104 production = new Production52_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}