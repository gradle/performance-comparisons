package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_35 {
    private final Production52_35 production = new Production52_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}