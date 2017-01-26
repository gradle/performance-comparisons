package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_84 {
    private final Production52_84 production = new Production52_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}