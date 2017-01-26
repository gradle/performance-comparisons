package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_113 {
    private final Production52_113 production = new Production52_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}