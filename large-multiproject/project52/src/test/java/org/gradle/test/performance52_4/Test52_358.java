package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_358 {
    private final Production52_358 production = new Production52_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}