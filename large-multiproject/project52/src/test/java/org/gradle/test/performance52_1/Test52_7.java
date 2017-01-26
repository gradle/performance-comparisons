package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_7 {
    private final Production52_7 production = new Production52_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}