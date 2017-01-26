package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_330 {
    private final Production52_330 production = new Production52_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}