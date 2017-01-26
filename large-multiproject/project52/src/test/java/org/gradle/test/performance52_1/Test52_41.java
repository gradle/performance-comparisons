package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_41 {
    private final Production52_41 production = new Production52_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}