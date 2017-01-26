package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_390 {
    private final Production52_390 production = new Production52_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}