package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_87 {
    private final Production52_87 production = new Production52_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}