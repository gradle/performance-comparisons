package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_145 {
    private final Production52_145 production = new Production52_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}