package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_361 {
    private final Production52_361 production = new Production52_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}