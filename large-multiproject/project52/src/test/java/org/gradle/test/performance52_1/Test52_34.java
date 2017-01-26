package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_34 {
    private final Production52_34 production = new Production52_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}