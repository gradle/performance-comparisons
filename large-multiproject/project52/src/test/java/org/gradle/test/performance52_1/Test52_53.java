package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_53 {
    private final Production52_53 production = new Production52_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}