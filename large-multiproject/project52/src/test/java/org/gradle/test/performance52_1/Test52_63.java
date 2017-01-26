package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_63 {
    private final Production52_63 production = new Production52_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}