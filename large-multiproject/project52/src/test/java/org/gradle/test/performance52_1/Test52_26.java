package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_26 {
    private final Production52_26 production = new Production52_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}