package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_294 {
    private final Production52_294 production = new Production52_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}