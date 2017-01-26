package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_31 {
    private final Production52_31 production = new Production52_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}