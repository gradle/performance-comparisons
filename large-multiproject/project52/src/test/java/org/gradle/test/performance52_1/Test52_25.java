package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_25 {
    private final Production52_25 production = new Production52_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}