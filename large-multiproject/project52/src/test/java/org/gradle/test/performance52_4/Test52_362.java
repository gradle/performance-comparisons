package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_362 {
    private final Production52_362 production = new Production52_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}