package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_67 {
    private final Production52_67 production = new Production52_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}