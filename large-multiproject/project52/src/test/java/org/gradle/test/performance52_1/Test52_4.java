package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_4 {
    private final Production52_4 production = new Production52_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}