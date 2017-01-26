package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_231 {
    private final Production52_231 production = new Production52_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}