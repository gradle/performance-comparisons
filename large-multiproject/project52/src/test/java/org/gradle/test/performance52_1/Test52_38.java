package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_38 {
    private final Production52_38 production = new Production52_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}