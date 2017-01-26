package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_418 {
    private final Production52_418 production = new Production52_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}