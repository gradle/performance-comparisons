package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_100 {
    private final Production52_100 production = new Production52_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}