package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_29 {
    private final Production52_29 production = new Production52_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}