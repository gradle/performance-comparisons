package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_10 {
    private final Production52_10 production = new Production52_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}