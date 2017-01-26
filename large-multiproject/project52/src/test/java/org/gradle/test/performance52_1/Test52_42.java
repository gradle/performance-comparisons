package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_42 {
    private final Production52_42 production = new Production52_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}