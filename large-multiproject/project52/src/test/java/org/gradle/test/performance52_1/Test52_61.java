package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_61 {
    private final Production52_61 production = new Production52_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}