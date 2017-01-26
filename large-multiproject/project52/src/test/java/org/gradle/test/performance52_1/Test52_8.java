package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_8 {
    private final Production52_8 production = new Production52_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}